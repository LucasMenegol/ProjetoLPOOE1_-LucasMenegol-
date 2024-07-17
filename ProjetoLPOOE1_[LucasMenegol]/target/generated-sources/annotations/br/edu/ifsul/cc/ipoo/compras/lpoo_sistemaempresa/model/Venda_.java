package br.edu.ifsul.cc.ipoo.compras.lpoo_sistemaempresa.model;

import br.edu.ifsul.cc.ipoo.compras.lpoo_sistemaempresa.model.Cliente;
import br.edu.ifsul.cc.ipoo.compras.lpoo_sistemaempresa.model.Funcionario;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-16T23:45:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Cliente> cliente;
    public static volatile SingularAttribute<Venda, Calendar> data;
    public static volatile SingularAttribute<Venda, Double> valor;
    public static volatile SingularAttribute<Venda, Integer> id;
    public static volatile SingularAttribute<Venda, Funcionario> funcionario;

}