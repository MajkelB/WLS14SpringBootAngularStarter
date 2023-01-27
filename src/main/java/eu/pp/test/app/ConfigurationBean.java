package eu.pp.test.app;


/*
Bean potrzebny tylko na blad: aplikacja nie chce dzialac jesli nie ma choc jednego beana
Mozna też podobno polozyc patcha na serwer ale mi nie zadzialalo
weblogic.application.ModuleException: javax.faces.FacesException: Unable to find CDI BeanManager
 */

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ConfigurationBean {
}


