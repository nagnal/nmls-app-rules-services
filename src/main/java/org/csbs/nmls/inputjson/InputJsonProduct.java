package org.csbs.nmls.inputjson;

import java.util.ArrayList;
import java.util.List;

import org.csbs.nmls.model.Product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputJsonProduct {

	@JsonProperty("lookup")
	public String lookup = "ksession-rule";
	@JsonProperty("commands")
	public List<Object> commands = new ArrayList<Object>();
    
	public class RulesCommand {
		@JsonProperty("fire-all-rules")
	    public String fireAllRules = "";
	}
	
	public class InsertCommand {
		@JsonProperty("insert")
	    public Insert insert ;
		
		public class Insert {
			@JsonProperty("out-identifier")
			public String outIdentifier = "org.csbs.nmls.model.Product";
		    @JsonProperty("return-object")
		    public String returnObject="true";
		    @JsonProperty("object")
		    public ProductWrapper productWrapper;
		    
		    public class ProductWrapper {
				@JsonProperty("org.csbs.nmls.model.Product")
			    public Product product;
			}
		}
	}
}