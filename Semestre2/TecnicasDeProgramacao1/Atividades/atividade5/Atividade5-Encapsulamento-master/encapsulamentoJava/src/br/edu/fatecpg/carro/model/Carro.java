package br.edu.fatecpg.carro.model;

	 
	public class Carro {
	    private String marca;
	    private String modelo;
	    private double capacidadeTanque;
	 
	    
	    public Carro(String marca, String modelo, double capacidadeTanque) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.capacidadeTanque = capacidadeTanque;
	    }
	 
	   
	    public String getMarca() {
	        return marca;
	    }
	 
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	 
	    public String getModelo() {
	        return modelo;
	    }
	 
	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }
	 
	    public double getCapacidadeTanque() {
	        return capacidadeTanque;
	    }
	 
	    public void setCapacidadeTanque(double capacidadeTanque) {
	        this.capacidadeTanque = capacidadeTanque;
	    }
	 
	    
	    public double calcularCustoEncherTanque(double precoGasolina) {
	        return capacidadeTanque * precoGasolina;
	    }
	 
	   
	}

