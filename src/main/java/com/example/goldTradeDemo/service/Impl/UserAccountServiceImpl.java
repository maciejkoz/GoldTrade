package com.example.goldTradeDemo.service.Impl;


import com.example.goldTradeDemo.api.request.CreateUserAccountRequest;
import com.example.goldTradeDemo.api.response.CreateUserAccountResponse;
import com.example.goldTradeDemo.common.MsgSource;
import com.example.goldTradeDemo.exception.CommonBadRequestException;
import com.example.goldTradeDemo.exception.CommonConflictException;
import com.example.goldTradeDemo.model.UserAccount;
import com.example.goldTradeDemo.repository.UserAccountRepository;
import com.example.goldTradeDemo.service.AbstractCommonService;
import com.example.goldTradeDemo.service.UserAccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.goldTradeDemo.common.ValidationUtils.*;

@Service
public class UserAccountServiceImpl extends AbstractCommonService implements UserAccountService {

    private UserAccountRepository userAccountRepository;

    public UserAccountServiceImpl(MsgSource msgSource, UserAccountRepository userAccountRepository) {
        super(msgSource);
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public ResponseEntity<CreateUserAccountResponse> createUserAccount(CreateUserAccountRequest request) {
        validateCreateAccountRequest(request);
        checkOwnerEmailAlreadyExist(request.getOwnerEmail());
        checkOwnerUsernameAlreadyExist(request.getOwnerUsername());
        UserAccount addedAccount = addUserAccountToDataSource(request);
        return ResponseEntity.ok(new CreateUserAccountResponse(msgSource.OK001, addedAccount.getAccountId()));
    }

    private void validateCreateAccountRequest(CreateUserAccountRequest request) {
        if (isNullOrEmpty(request.getOwnerFirstName())
                || isNullOrEmpty(request.getOwnerLastName())
                || isNullOrEmpty(request.getOwnerEmail())
                || isNull(request.getOwnerUsername())
                || isNull(request.getOwnerPassword())
                || isNull(request.getOwnerAge())
        ) {

            throw new CommonBadRequestException(msgSource.ERR001);
        }
        if (isUncorrectedEmail(request.getOwnerEmail())) {
            throw new CommonBadRequestException(msgSource.ERR002);
        }
        if (isUncorrectedPassword(request.getOwnerPassword())) {
            throw new CommonBadRequestException(msgSource.ERR002);
//            komunikar erroru!!!!!
        }
        if (isUncorrectedAge(request.getOwnerAge())) {
            throw new CommonConflictException(msgSource.ERR003);
        }
    }

    private void checkOwnerEmailAlreadyExist(String ownerEmail) {
        List<UserAccount> userAccounts = userAccountRepository.findByOwnerEmail(ownerEmail);
        if (!userAccounts.isEmpty()) {
            throw new CommonConflictException(msgSource.ERR004);
        }
    }

    private void checkOwnerUsernameAlreadyExist(String ownerUsername) {
        List<UserAccount> userAccounts = userAccountRepository.findByOwnerEmail(ownerUsername);
        if (!userAccounts.isEmpty()) {
            throw new CommonConflictException(msgSource.ERR004);

//            sprawdz komunikat erroru!!
        }
    }

    private UserAccount addUserAccountToDataSource(CreateUserAccountRequest request) {
        UserAccount userAccount = new UserAccount(
                null,
//                 private long accountId; ??????
                request.getOwnerFirstName(),
                request.getOwnerLastName(),
                request.getOwnerEmail(),
                request.getOwnerUsername(),
                request.getOwnerPassword(),
                request.getOwnerAge(),
                request.getOwnerBalanceUSD(),
                request.getOwnerBalanceXAG());
        return userAccountRepository.save(userAccount);
    }


//    @Override
//    public ResponseEntity<BasicResponse> rechargeUserAccount(Long accountId, String amount) {
//        BigDecimal rechargeAmount = extractAmountToBigDecimal(amount);
//        addRechargeAmountToUserAccountBalance(accountId, rechargeAmount);
//        return ResponseEntity.ok(BasicResponse.of(msgSource.OK002));
//    }
//
//    private BigDecimal extractAmountToBigDecimal(String amount) {
//        try {
//            return new BigDecimal(amount);
//        } catch (NumberFormatException nfe) {
//            throw new CommonBadRequestException(msgSource.ERR005);
//        }
//    }
//
//    private void addRechargeAmountToUserAccountBalance(Long accountId, BigDecimal rechargeAmount) {
//        Optional<UserAccount> userAccountData = userAccountRepository.findById(accountId);
//        if (!userAccountData.isPresent()) {
//            throw new CommonConflictException(msgSource.ERR006);
//        }
//        UserAccount accountData = userAccountData.get();
//        accountData.setBalance(accountData.getBalance().add(rechargeAmount));
//        userAccountRepository.save(accountData);
//    }
}




