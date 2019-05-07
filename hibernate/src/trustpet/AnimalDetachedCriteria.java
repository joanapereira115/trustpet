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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AnimalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression tipoId;
	public final AssociationExpression tipo;
	public final StringExpression nome;
	public final StringExpression photo;
	public final IntegerExpression idade;
	public final StringExpression porte;
	public final StringExpression sexo;
	public final StringExpression alergias;
	public final StringExpression doenças;
	public final StringExpression comportamento;
	public final BooleanExpression vacinas;
	public final BooleanExpression desparasitacao;
	public final BooleanExpression esterilizacao;
	public final StringExpression raca;
	public final StringExpression descricao;
	
	public AnimalDetachedCriteria() {
		super(trustpet.Animal.class, trustpet.AnimalCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tipoId = new IntegerExpression("tipo.id", this.getDetachedCriteria());
		tipo = new AssociationExpression("tipo", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		photo = new StringExpression("photo", this.getDetachedCriteria());
		idade = new IntegerExpression("idade", this.getDetachedCriteria());
		porte = new StringExpression("porte", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		alergias = new StringExpression("alergias", this.getDetachedCriteria());
		doenças = new StringExpression("doenças", this.getDetachedCriteria());
		comportamento = new StringExpression("comportamento", this.getDetachedCriteria());
		vacinas = new BooleanExpression("vacinas", this.getDetachedCriteria());
		desparasitacao = new BooleanExpression("desparasitacao", this.getDetachedCriteria());
		esterilizacao = new BooleanExpression("esterilizacao", this.getDetachedCriteria());
		raca = new StringExpression("raca", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
	}
	
	public AnimalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, trustpet.AnimalCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		tipoId = new IntegerExpression("tipo.id", this.getDetachedCriteria());
		tipo = new AssociationExpression("tipo", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		photo = new StringExpression("photo", this.getDetachedCriteria());
		idade = new IntegerExpression("idade", this.getDetachedCriteria());
		porte = new StringExpression("porte", this.getDetachedCriteria());
		sexo = new StringExpression("sexo", this.getDetachedCriteria());
		alergias = new StringExpression("alergias", this.getDetachedCriteria());
		doenças = new StringExpression("doenças", this.getDetachedCriteria());
		comportamento = new StringExpression("comportamento", this.getDetachedCriteria());
		vacinas = new BooleanExpression("vacinas", this.getDetachedCriteria());
		desparasitacao = new BooleanExpression("desparasitacao", this.getDetachedCriteria());
		esterilizacao = new BooleanExpression("esterilizacao", this.getDetachedCriteria());
		raca = new StringExpression("raca", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
	}
	
	public Tipo_AnimalDetachedCriteria createTipoCriteria() {
		return new Tipo_AnimalDetachedCriteria(createCriteria("tipo"));
	}
	
	public Animal uniqueAnimal(PersistentSession session) {
		return (Animal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Animal[] listAnimal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Animal[]) list.toArray(new Animal[list.size()]);
	}
}

