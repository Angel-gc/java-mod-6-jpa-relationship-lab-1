package org.example;

import Model.Capital;
import Model.Country;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Capital capital = new Capital("Ottawa");
        Country country = new Country("Canada");

        capital.setCountry(country);
        country.setCapital(capital);

        entityManager.persist(capital);
        entityManager.persist(country);

        transaction.commit();

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}