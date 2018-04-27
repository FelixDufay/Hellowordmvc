package org.helloworldmvc.model;

import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {
	private String filename = helloword;
	
	public String getHelloWorld() {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line;
		while ((line = br.readLine()) != null) {
			return line
		}
		br.close();
	}

}
