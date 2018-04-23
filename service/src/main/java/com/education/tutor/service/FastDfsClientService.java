package com.education.tutor.service;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class FastDfsClientService {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Value("${fast-dfs-client-conf.location}")
	String fastDfsClientConf = "/fast-dfs-client.properties";

	@Autowired
	ResourceLoader resourceLoader;

	TrackerClient trackerClient;
	TrackerServer trackerServer;

	@PostConstruct
	void init() throws Exception {
		Resource resource = resourceLoader.getResource("classpath:" + fastDfsClientConf);
		ClientGlobal.init(resource.getInputStream());
		try {
			trackerClient = new TrackerClient();
			trackerServer = trackerClient.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public String upload(byte[] content, String name, String ext, int size, NameValuePair[] valuePairs)
			throws Exception {
		logger.info("before create storageServer");
		StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
		StorageClient1 storageClient1 = new StorageClient1(trackerServer, storageServer);
		logger.info("after create storageServer");
		String[] uploadResults = null;
		try {
			uploadResults = storageClient1.upload_file(content, ext, valuePairs);
			String groupName = uploadResults[0];
			String remoteFileName = uploadResults[1];
			String fileRelativePath = groupName + "/" + remoteFileName;
			logger.info("save succ, returned stored path " + fileRelativePath);
			return fileRelativePath;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			storageServer.close();
		}
	}

	public byte[] download(String groupName, String remoteFileName) throws Exception {
		logger.info("before create storageServer");
		StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		logger.info("after create storageServer");
		try {
			return storageClient.download_file(groupName, remoteFileName);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			storageServer.close();
		}
	}

}
