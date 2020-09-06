/**  
* <p>Title: Converter.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-8-19  
* @version 1.0  
*/  
package com.mdjin;

import java.io.File;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

/**  
* <p>Title: Converter</p>  
* <p>Description: </p>  
* @author JinMaoDong
* @date 2020-8-19  
*/
/**
 * change file's encoding(gbk) to utf-8
 * 
 * @author lichmama
 *
 */
public class Converter {
    private static String sourceDir;
    private static String fileExtension = "*";
    private static int maxDepth = Integer.MAX_VALUE;

    /**
     * java -jar gbk2utf.jar --src xxx --ext xxx --max-depth xxx
     * 
     * @param args
     */
    public static void main(String[] args) {
        if (usage(args)) {
            logger("Usage: java -jar gbk2utf.jar [OPTIONS]");
            logger("Change file's encoding(gbk) to utf-8 (@lichmama)");
            logger("OPTIONS:");
            logger("  --src <source path>, essential");
            logger("  --ext <file extension>, optional");
            logger("  --max-depth <max depth>, optional");
            return;
        }

        logger("source: " + sourceDir);
        logger("  file: " + ("*".equals(fileExtension) ? "*" : "*." + fileExtension));
        logger("====================================");
        Converter converter = new Converter();
        converter.process(sourceDir, fileExtension, maxDepth);
        logger("====================================**DONE");
    }

    public void process(String src, String ext, int maxDepth) {
        File _src = new File(src);
        if (!_src.exists()) {
            logger("the path \"{0}\" not exist!", src);
            return;
        }
        if (_src.isDirectory()) {
            List<File> files = ConverterUtil.listFiles(_src, ext, maxDepth);
            if (files.size() == 0) {
                logger("NO FILES TO BE PROCESSED.");
                return;
            } else {
                logger("TOTAL FOUND {0} FILES, BEGIN TO PROCESS...\n", files.size());
            }
            files.stream().forEach(f -> utf2gbk(f));
        } else {
        	utf2gbk(_src);
        }
    }

    public boolean utf2gbk(File file) {
        try {
            String content = ConverterUtil.readString(file, "GBK");
            ConverterUtil.writeString(file, content, "GBK");
        } catch (Exception e) {
            logger("process {0} - FAILURE, reason: {1}", file.getName(), e.getMessage());
            return false;
        }
        logger("process {0} - SUCCESS", file.getName());
        return true;
    }
    
//    public boolean gbk2utf(File file) {
//        try {
//            String content = ConverterUtil.readString(file, "GBK");
//            ConverterUtil.writeString(file, content, "UTF-8");
//        } catch (Exception e) {
//            logger("process {0} - FAILURE, reason: {1}", file.getName(), e.getMessage());
//            return false;
//        }
//        logger("process {0} - SUCCESS", file.getName());
//        return true;
//    }

    private static boolean usage(String[] args) {
        Map<String, String> argsMap = ConverterUtil.parseArgs(args);
        if (argsMap.get("--src") != null && !"".equals(argsMap.get("--src"))) {
            sourceDir = argsMap.get("--src");
        } else {
            return true;
        }
        if (argsMap.get("--ext") != null) {
            if (!"".equals(argsMap.get("--ext"))) {
                fileExtension = argsMap.get("--ext").toLowerCase();
            } else {
                return true;
            }
        }
        if (argsMap.get("--max-depth") != null) {
            if (!"".equals(argsMap.get("--max-depth"))) {
                maxDepth = Integer.parseInt(argsMap.get("--max-depth"));
            } else {
                return true;
            }
        }
        return false;
    }

    private static void logger(String s) {
        System.out.println(s);
    }
    
    private static void logger(String pattern, Object...arguments) {
        logger(MessageFormat.format(pattern, arguments));
    }
}