package br.com.java.estudo.function.interfac;

@FunctionalInterface
public interface MyFirstFunctionalInterface {

	public void firstWork();
	 
    @Override
    public String toString();                //Overridden from Object class
 
    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}
