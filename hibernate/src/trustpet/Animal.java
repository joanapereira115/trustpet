/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Joana(Universidade do Minho)
 * License Type: Academic
 */
package trustpet;

public class Animal {
	public Animal() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ANIMAL_TIPO) {
			this.tipo = (trustpet.Tipo_Animal) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private trustpet.Tipo_Animal tipo;
	
	private String nome;
	
	private String photo;
	
	private int idade;
	
	private String porte;
	
	private String sexo;
	
	private String alergias;
	
	private String doenças;
	
	private String comportamento;
	
	private boolean vacinas;
	
	private boolean desparasitacao;
	
	private boolean esterilizacao;
	
	private String raca;
	
	private String descricao;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPhoto(String value) {
		this.photo = value;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setIdade(int value) {
		this.idade = value;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setPorte(String value) {
		this.porte = value;
	}
	
	public String getPorte() {
		return porte;
	}
	
	public void setSexo(String value) {
		this.sexo = value;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setAlergias(String value) {
		this.alergias = value;
	}
	
	public String getAlergias() {
		return alergias;
	}
	
	public void setDoenças(String value) {
		this.doenças = value;
	}
	
	public String getDoenças() {
		return doenças;
	}
	
	public void setComportamento(String value) {
		this.comportamento = value;
	}
	
	public String getComportamento() {
		return comportamento;
	}
	
	public void setVacinas(boolean value) {
		this.vacinas = value;
	}
	
	public boolean getVacinas() {
		return vacinas;
	}
	
	public void setDesparasitacao(boolean value) {
		this.desparasitacao = value;
	}
	
	public boolean getDesparasitacao() {
		return desparasitacao;
	}
	
	public void setEsterilizacao(boolean value) {
		this.esterilizacao = value;
	}
	
	public boolean getEsterilizacao() {
		return esterilizacao;
	}
	
	public void setRaca(String value) {
		this.raca = value;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setTipo(trustpet.Tipo_Animal value) {
		this.tipo = value;
	}
	
	public trustpet.Tipo_Animal getTipo() {
		return tipo;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}