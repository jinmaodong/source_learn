/**  
* <p>Title: ConverterUtil.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.joyintech.com</p>  
* @author jinmaodong  
* @date 2020-8-19  
* @version 1.0  
*/
package com.mdjin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Title: ConverterUtil
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author JinMaoDong
 * @date 2020-8-19
 */
public class ConverterUtil {
	private static String lineSepator;

	static {
		String osName = System.getProperty("os.name");
		if (osName.contains("Windows")) {
			lineSepator = "\r\n";
		} else {
			lineSepator = "\n";
		}
	}

	public static Map<String, String> parseArgs(String[] args) {
		Map<String, String> argsMap = new HashMap<String, String>();
		for (int i = 0; i < args.length; i++) {
			String key = args[i];
			if (++i >= args.length) {
				argsMap.put(key, "");
			} else {
				argsMap.put(key, args[i]);
			}
		}
		return argsMap;
	}

	public static void writeString(File file, String content, String encoding) throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file), encoding);
		osw.write(content);
		osw.close();
	}

	public static String readString(File file, String encoding) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding));
		StringBuilder buff = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			//modify jinmaodong 如果一行内出现分号的话，则在分号后面增加换行符
			if(line.contains(";")) {
				line.replaceAll(";", ";"+lineSepator);
			}
			
			if (buff.length() > 0) {
				buff.append(lineSepator);
			}
			buff.append(line);
		}
		br.close();
		return buff.toString();
	}

	public static List<File> listFiles(File dir, String ext, int maxDepth) {
		List<File> files = new ArrayList<File>();
		seekFiles(dir, ext, maxDepth, files);
		return files;
	}

	private static void seekFiles(File dir, String ext, int maxDepth, List<File> files) {
		if (maxDepth-- <= 0) {
			return;
		}
		files.addAll(Arrays.asList(dir.listFiles(f -> {
			return f.isFile() && "*".equals(ext) ? true : f.getName().toLowerCase().endsWith("." + ext);
		})));
		for (File _dir : dir.listFiles(f -> f.isDirectory())) {
			seekFiles(_dir, ext, maxDepth, files);
		}
	}
}