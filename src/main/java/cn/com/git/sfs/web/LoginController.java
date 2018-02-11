package cn.com.git.sfs.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by git on 2018/2/11.
 */
@RestController
@Api(value = "登录接口")
public class LoginController {

    @GetMapping("/login")
    @ApiOperation(value = "登录", notes = "login逻辑")
    public String login(){

        return "login";
    }
}
