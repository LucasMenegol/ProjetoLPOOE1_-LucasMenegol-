package br.edu.ifsul.cc.ipoo.compras.lpoo_sistemaempresa.model;

import br.edu.ifsul.cc.ipoo.compras.lpoo_sistemaempresa.model.Venda;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-16T23:45:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ { 

    public static volatile SingularAttribute<Funcionario, Double> salario;
    public static volatile SingularAttribute<Funcionario, String> cpf;
    public static volatile ListAttribute<Funcionario, Venda> vendas;
    public static volatile SingularAttribute<Funcionario, String> nome;
    public static volatile SingularAttribute<Funcionario, Integer> id;
    public static volatile SingularAttribute<Funcionario, String> cargo;

}