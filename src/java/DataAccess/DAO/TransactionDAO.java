package DataAccess.DAO;

import DataAccess.Entity.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author arqsoft_2016_2
 */
public class TransactionDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankPU");    

    public Transaction persist(Transaction transaction) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(transaction);
            em.getTransaction().commit();
        } catch(Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();     
        }
        return transaction;
    }

    public Transaction searchByTransactionNumber(Long transactionNumber) {
        EntityManager em = emf.createEntityManager();
        Transaction transaction = null;
        try {
            transaction = em.find(Transaction.class, transactionNumber);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return transaction;
    }
    
}