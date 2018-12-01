package com.sheldonleandro.computervision;
import org.opencv.core.Core;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * Copyright (c) 2017, 2018, Sheldon Leandro (PTY) LTYD and/or its affiliates. 
 * All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sheldon Leandro , PostNet Suite 129 Private Bag X 1510 
 * Glenvista 2058 Johannesburg South Africa
 * or visit www.sheldonleandro.com if you need additional information or have any
 * questions.
 */

@SpringBootApplication
public class ComputerVisionApplication implements CommandLineRunner {
 
    private static Logger LOGGER = LoggerFactory.getLogger(ComputerVisionApplication.class);
    
    public static void main(String[] args) {
    	LOGGER.info("STARTING THE APPLICATION");
        SpringApplication.run(ComputerVisionApplication.class, args);
        LOGGER.info("APPLICATION FINISHED");
    }
  
    @Override
    public void run(String... args){
    	try {
			nu.pattern.OpenCV.loadShared();
			System.out.println("======================================================\r\n");
	        System.out.println("Hello World Im Learning Open CV Version "+ Core.VERSION +"\r\n");
	        System.out.println("======================================================\r\n");
		}
		catch (Exception e) {
			LOGGER.error(e.getMessage());
		}	
    }
    
}