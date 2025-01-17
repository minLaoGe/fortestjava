/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.example.fortest.demos.web;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class BasicController {

    //
    private int prod_isFinished = 0;

    // 未开始，
    private int isStarted = 0;

    //
    private int erm_isFinished = 0;


    public String erm_results = null;
    public String prod_results = null;

    // http://127.0.0.1:8080/hello?name=lisi
    @RequestMapping("/sdfsFFF333gg/3pkffff/{isstart}")
    @ResponseBody
    public Integer hello(@PathVariable int isstart) {
        this.isStarted=isstart;
        return this.isStarted;
    }
    // http://127.0.0.1:8080/hello?name=lisi
    @RequestMapping("/sdfsFFF333gg/3pkffffprod/{isstart}")
    @ResponseBody
    public Integer prod_isFinished(@PathVariable int isstart) {
        if (100 == isstart){
            return this.prod_isFinished;
        }
        this.prod_isFinished=isstart;
        return this.prod_isFinished;
    }
    // http://127.0.0.1:8080/hello?name=lisi
    @RequestMapping("/sdfsFFF333gg/3pkfffferm/{isstart}")
    @ResponseBody
    public Integer erm_isFinished(@PathVariable int isstart) {
        if (100 == isstart){
            return this.erm_isFinished;
        }
        this.erm_isFinished=isstart;
        return this.erm_isFinished;
    }
    // http://127.0.0.1:8080/hello?name=lisi
    @RequestMapping("/sdfsFFF333gg/3pkffff/get")
    @ResponseBody
    public Integer hello() {
        return this.isStarted;
    }

    @RequestMapping("/sdfsFFF555/getEmail/get/{environment}/{result}")
    @ResponseBody
    public String getEmail(@PathVariable Integer environment,@PathVariable String result) {
            if (0==environment){
                this.erm_results=result;
                return this.erm_results;
            }else if (1==environment){
                this.prod_results=result;
                return this.prod_results;
            }
        return null;
    }
    @RequestMapping("/sdfsFFF555/getEmail/getResult/{environment}")
    @ResponseBody
    public String getResult(@PathVariable Integer environment) {
        if (0==environment){
            return this.erm_results;
        }else if (1==environment){
            return this.prod_results;
        }
        return null;
    }

}
