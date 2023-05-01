package br.com.alura.gerenciador;

import java.util.Date;

public class Empresa{ 

    private Integer id;
    private String nome;
    private Date dataAbertura = new Date();

    public Integer getId() { 
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { 
        this.nome = nome;
    }
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
    
	/* Caso o xml de problemas no futuro:
	 * <welcome-file>index.html</welcome-file>
	 * <welcome-file>index.jsp</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.jsp</welcome-file>
    <welcome-file>default.htm</welcome-file>
    
	 */
} 
