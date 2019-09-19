package trabm2;
        
import java.util.ArrayList;

public class Consultorio {

    //atributos
        private String nomeConsultorio;
	private int telefone;
	
    /** construtor e getters e setters **/        
	public Consultorio(String nomeConsultorio, int telefone) {
		this.nomeConsultorio = nomeConsultorio;
		this.telefone = telefone;
	}
	
	public Consultorio() {
		
	}

	public String getNomeConsultorio() {
		return nomeConsultorio;
	}
        
	public void setNomeConsultorio(String nomeConsultorio) {
		this.nomeConsultorio = nomeConsultorio;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
        
    /** listas e métodos **/
        private static ArrayList<Pessoa> listaPessoa = new ArrayList<>();
	private static ArrayList<Medico> lista = new ArrayList<>();
        private static ArrayList<Secretaria> listaSecretaria = new ArrayList<>();
        private static ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        private static ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public static ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public static void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        Consultorio.listaPessoa = listaPessoa;
    }

    public static ArrayList<Medico> getLista() {
        return lista;
    }

    public static void setLista(ArrayList<Medico> lista) {
        Consultorio.lista = lista;
    }

    public static ArrayList<Secretaria> getListaSecretaria() {
        return listaSecretaria;
    }

    public static void setListaSecretaria(ArrayList<Secretaria> listaSecretaria) {
        Consultorio.listaSecretaria = listaSecretaria;
    }

    public static ArrayList<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public static void setListaFuncionario(ArrayList<Funcionario> listaFuncionario) {
        Consultorio.listaFuncionario = listaFuncionario;
    }

    public static ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public static void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        Consultorio.listaPacientes = listaPacientes;
    }
	
	public void cadastrar(Paciente p) {
                
		listaPacientes.add(p);
		
	}
	
	public String mostrar() {
		String saida = "";
		int index = 1;
		
		for(Paciente p : listaPacientes) {
			saida += "\n Paciente nº " + (index++) + "\n";
			saida += p.imprimirPaciente();
		}
		
		return saida;
	}
	
	public int pesquisarNome(String nomePaciente) {
		int qtd = 0;
		
		for(Paciente p : listaPacientes) {
			try {
				//if(m.getNomeConsultorio().equals(nomePaciente)) {
                                if(p.getNomePaciente().equals(nomePaciente)) {
					qtd++;
				}
			}
			catch(Exception e) {
				System.out.println("Errou");
			}
			finally {
				System.out.println(nomePaciente);
			}
			
			qtd++;
		}
		
		return qtd;
	}
        
        public int pesquisarNumero(int vInicio, int vFinal){
            int qtd = 0;
            
            for(Paciente p : listaPacientes){
                if( (p.getNumeroAtendimento() >= vInicio) && (p.getNumeroAtendimento() <= vFinal) ){
                    qtd++;
                }
            }
            
            return qtd;
        }
        
        public boolean excluir(String nomePaciente){
            boolean result = false;
            
            for ( Paciente p : listaPacientes ){
                if(p.getNomePaciente().equalsIgnoreCase(nomePaciente)){
                    listaPacientes.remove(p);
                    result = true;
                }
                else{
                    result = false;
                }
                
            }
            return result;
        }
	
        public int calcularTotalPacientes(){
            int total = 0;
            
            for( Paciente p : listaPacientes ){
                total += p.getNumeroAtendimento(); 
            }
           
            return total;
        }
        
        public int calcularTotalSecretarios(){
            int total = 0;
            
            for( Secretaria s : listaSecretaria ){
                total += s.getIdSecretaria();
            }
            
            return total;
        }
        
        public int calcularTotalMedicos(){
            int total = 0;
            
            for( Medico m : lista ){
                total += m.getRegistro();
            }
            
            return total;
        }
        
}
