package org.helloworldmvc.model;

import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {
	
	public String getHelloWorld() {
		BufferedReader br = new BufferedReader(new FileReader(helloword));
		String line;
		while ((line = br.readLine()) != null) {
			return line
		}
		br.close();
	}

}
