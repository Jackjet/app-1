package io.zhijian.app.router.sys;

import io.zhijian.base.router.BaseRouter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hao on 2017-03-24.
 */
@Controller
@RequestMapping(value = "/admin/log")
public class LogRouter extends BaseRouter{

    @Override
    protected String getPrefix() {
        return "/admin/sys/log";
    }
}
