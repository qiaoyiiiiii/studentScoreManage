package com.qiaoyi.student.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qiaoyi.student.Entity.Accounts;
import jakarta.mail.MessagingException;


public interface AccountsService extends IService<Accounts> {
    public void sendEmail(String to, String subject, String text);
}
