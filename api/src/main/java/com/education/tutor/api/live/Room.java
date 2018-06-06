package com.education.tutor.api.live;

import java.io.Serializable;

/**
 * Created by 雪峰 on 2018/5/8.
 */
public class Room implements Serializable {

        private String roomId;
        private String title;
        private String startTime;
        private String endTime;
        //回放有效期截止时间
        private  String validEndTime;
        private  boolean video;
        //主讲人邀请码
        private  String hostCode;

        private String coverImgUrl;

        private String convertStatus;

        public String getRoomId() {
            return roomId;
        }

        public void setRoomId(String roomId) {
            this.roomId = roomId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getValidEndTime() {
            return validEndTime;
        }

        public void setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public String getHostCode() {
            return hostCode;
        }

        public void setHostCode(String hostCode) {
            this.hostCode = hostCode;
        }

    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    public String getConvertStatus() {
        return convertStatus;
    }

    public void setConvertStatus(String convertStatus) {
        this.convertStatus = convertStatus;
    }
}
