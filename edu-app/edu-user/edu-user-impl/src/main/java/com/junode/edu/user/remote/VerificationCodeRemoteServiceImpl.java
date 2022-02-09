package com.junode.edu.user.remote;

import com.junode.edu.common.result.ResponseDTO;
import com.junode.edu.user.api.VerificationCodeRemoteService;
import com.junode.edu.user.exception.ExpireCodeRuntimeException;
import com.junode.edu.user.exception.IncorrectCodeRuntimteException;
import com.junode.edu.user.service.IVerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/vfcode")
public class VerificationCodeRemoteServiceImpl implements VerificationCodeRemoteService {

    @Autowired
    private IVerificationCodeService verificationCodeService;

    @Override
    @RequestMapping(value = "/sendCodeRemote")
    public ResponseDTO sendCode(String telephone) {
        ResponseDTO responseDTO = null;
        try {
            boolean res = verificationCodeService.save(telephone);
            responseDTO = ResponseDTO.success("发送成功");
        }catch (Exception e){
            e.printStackTrace();
            responseDTO = ResponseDTO.ofError(e.getMessage());
        }
        return responseDTO;
    }

    /*
      验证码不正确,设置状态码为203
      验证码过期,设置状态码为204
   */
    @Override
    @RequestMapping(value = "/checkCodeRemote")
    public ResponseDTO checkCode(String telephone, String code) {
        ResponseDTO responseDTO = null;
        try {
            boolean checkCode = verificationCodeService.checkCode(telephone, code);
            responseDTO = ResponseDTO.success("验证成功");
        }catch (IncorrectCodeRuntimteException e){
            responseDTO = ResponseDTO.response(203,e.getMessage(),null);
        }catch (ExpireCodeRuntimeException e){
            responseDTO = ResponseDTO.response(204,e.getMessage(),null);
        }catch (Exception e){
            e.printStackTrace();
            responseDTO = ResponseDTO.ofError(e.getMessage());
        }
        return responseDTO;
    }
}
