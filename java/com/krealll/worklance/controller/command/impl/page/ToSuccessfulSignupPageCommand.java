package com.krealll.worklance.controller.command.impl.page;

import com.krealll.worklance.controller.PagePath;
import com.krealll.worklance.controller.command.Command;
import com.krealll.worklance.controller.router.Router;

import javax.servlet.http.HttpServletRequest;

public class ToSuccessfulSignupPageCommand implements Command {
    @Override
    public Router execute(HttpServletRequest request) {
        Router router = new Router(PagePath.SUCCESSFUL_SING_UP);
        return router;
    }
}
