package com.gaoxu.springboot.mapper;

import com.gaoxu.springboot.pojo.UserFeedback;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 对用户反馈表进行操作
 * （用户）添加反馈，查看历史反馈，删除反馈，修改反馈（暂定）
 * @author GAOXU
 */
@Repository
public interface UserFeedbackMapper {
    /**
     * 查找所有的反馈消息
     * @return UserFeedback列表
     */
    public List<UserFeedback> findAllUserFeedback();

    /**
     * 根据feedbackId查询所对应的用户反馈
     * @param feedbackId 用户反馈id
     * @return UserFeedback
     */
    public UserFeedback findUserFeedbackById(int feedbackId);

    /**
     * 添加用户反馈
     * @param userFeedback 用户反馈实体
     * @return 无
     */
    public int addUserFeedback(UserFeedback userFeedback);

    /**
     * 修改用户反馈
     * @param userFeedback 用户反馈实体
     * @return 无
     */
    public int updateFeedback(UserFeedback userFeedback);

    /**
     * 根据feedbackId删除用户反馈
     * @param feedbackId 用户反馈id
     * @return 无
     */
    public int deleteFeedback(int feedbackId);
}
