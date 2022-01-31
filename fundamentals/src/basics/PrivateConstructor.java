package basics;

class PrivateConstructor {
	
	private static PrivateConstructor object=null;
	
	private PrivateConstructor() {
		
	}
	
	public PrivateConstructor getObject() {
		if(object==null) {
			object=new PrivateConstructor();
		}
		
		return object;
		
	}

}
