package com.education.tutor.db.mapper;

import com.education.tutor.api.EmailUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommonMapper {


    @Select("select t.first_name as userName,i.start as start,end as end,s.name as vaule,t.email,t.timezone from interview i,teacher t,sys_user s  where i.teacher_id = t.id and i.`start` > now()" +
            "and i.interviewer_id = s.id and t.`delete_flag` = 'IN_FORCE' and i.`delete_flag` = 'IN_FORCE' and s.`delete_flag` = 'IN_FORCE' and i.start is not null and i.state = 2")
    public List<EmailUser> getInterview();

    @Select("select t.first_name as userName,cs.start as start,cs.end as end,t.email,t.timezone  from course_schedule cs left join courseware cw on cs.id = cw.`course_schedule_id` and  " +
            " cw.`delete_flag` = 'IN_FORCE',teacher t,course c  where cs.course_id = c.id and c.primary_teacher_id = t.id and cw.id is null and  t.`delete_flag` = 'IN_FORCE' and c.`delete_flag` = 'IN_FORCE'")
    public List<EmailUser> getCourseware();


    @Select("select  t.first_name as userName,cs.start as start,cs.end as end,t.email,t.timezone  from study_schedule ss,course_schedule cs,course c ,teacher t where ss.course_schedule_id = cs.id and cs.course_id = c.id" +
            "  and c.primary_teacher_id = t.id and ss.`delete_flag` = 'IN_FORCE' and cs.`delete_flag` = 'IN_FORCE' and c.`delete_flag` = 'IN_FORCE' and t.`delete_flag` = 'IN_FORCE' and ss.student_evaluation is null")
    public List<EmailUser> getStudentEvaluation();

}
