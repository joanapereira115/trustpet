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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DonoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final BooleanExpression ativo;
	public final StringExpression nome;
	public final StringExpression photo;
	public final StringExpression email;
	public final StringExpression contacto;
	public final StringExpression residencia;
	public final BooleanExpression jardim;
	public final StringExpression morada;
	public final StringExpression password;
	public final CollectionExpression animais;
	
	public DonoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		ativo = new BooleanExpression("ativo", this);
		nome = new StringExpression("nome", this);
		photo = new StringExpression("photo", this);
		email = new StringExpression("email", this);
		contacto = new StringExpression("contacto", this);
		residencia = new StringExpression("residencia", this);
		jardim = new BooleanExpression("jardim", this);
		morada = new StringExpression("morada", this);
		password = new StringExpression("password", this);
		animais = new CollectionExpression("ORM_Animais", this);
	}
	
	public DonoCriteria(PersistentSession session) {
		this(session.createCriteria(Dono.class));
	}
	
	public DonoCriteria() throws PersistentException {
		this(ClassPersistentManager.instance().getSession());
	}
	
	public AnimalCriteria createAnimaisCriteria() {
		return new AnimalCriteria(createCriteria("ORM_Animais"));
	}
	
	public Dono uniqueDono() {
		return (Dono) super.uniqueResult();
	}
	
	public Dono[] listDono() {
		java.util.List list = super.list();
		return (Dono[]) list.toArray(new Dono[list.size()]);
	}
}

