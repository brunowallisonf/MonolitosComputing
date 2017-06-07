package br.com.computingforum.model;


	public enum category{
		SEGURANCA ("sec"),
		HARDWARE ("hard"), 
		PROGRAMACAO ("prog"),
		REDES ("net"),
		SISTEMAS_OPERACIONAIS ("so");
		
		private String value;
		
		private category(String value) {
			this.value = value;
		}
		 public String getCategory() {
		        return this.value;
		}
		
		 
};
	

