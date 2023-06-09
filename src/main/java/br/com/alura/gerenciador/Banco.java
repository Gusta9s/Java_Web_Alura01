package br.com.alura.gerenciador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco { 

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSquencial = 1;
    
    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSquencial++);
        empresa.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSquencial++);
        empresa2.setNome("Caelum");
        lista.add(empresa);
        lista.add(empresa2);
    }

    // Responsavel por acrecentar registros de informações ao banco de dados, que foi mandado de NovaEmpresaServlet...
    public void adiciona(Empresa empresa) {
    	empresa.setId(Banco.chaveSquencial++);
        Banco.lista.add(empresa);
    }
    
    // Responsavel por encaminhar a lista para ListaEmpresaServlet...
    public List<Empresa> getEmpresas(){ 
        return Banco.lista;
    }

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa: lista) { 
	        if(empresa.getId() == id)  {
	            return empresa;
	        }

	    }
	    return null;
	}

}
