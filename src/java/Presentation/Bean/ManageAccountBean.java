package Presentation.Bean;

import BusinessLogic.Controller.HandleAccount;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
/**
 *
 * @author arqsoft_2016_2
 */
@ManagedBean
@ViewScoped
public class ManageAccountBean {
    
    private Long accountNumberConsign;
    private Long accountNumberExtractBalance;
    private Long transactionNumber;
    private String transactionMessage;
    private int value;
    private String consignMessage;
    private String extractMessage;

    public ManageAccountBean() {
        consignMessage = "";
        extractMessage = "";
        transactionMessage = "";
    }

    public Long getAccountNumberConsign() {
        return accountNumberConsign;
    }

    public void setAccountNumberConsign(Long accountNumberConsign) {
        this.accountNumberConsign = accountNumberConsign;
    }

    public Long getAccountNumberExtractBalance() {
        return accountNumberExtractBalance;
    }

    public void setAccountNumberExtractBalance(Long accountNumberExtractBalance) {
        this.accountNumberExtractBalance = accountNumberExtractBalance;
    }

    public Long getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Long transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getConsignMessage() {
        return consignMessage;
    }

    public void setConsignMessage(String consignMessage) {
        this.consignMessage = consignMessage;
    }

    public String getExtractMessage() {
        return extractMessage;
    }

    public void setExtractMessage(String extractMessage) {
        this.extractMessage = extractMessage;
    }

    public void consign() {
        HandleAccount handleAccount = new HandleAccount();
        consignMessage = handleAccount.consign(accountNumberConsign, value);
    }

    public void extractBalance() {
        HandleAccount handleAccount = new HandleAccount();
        extractMessage = handleAccount.extractBalance(accountNumberExtractBalance);
    }

    public void extractTransaction() {      
        HandleAccount handleAccount = new HandleAccount();
        transactionMessage = handleAccount.extractTransaction(transactionNumber);
    }
    
}