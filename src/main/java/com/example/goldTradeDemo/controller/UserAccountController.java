package com.example.goldTradeDemo.controller;

import com.example.goldTradeDemo.api.request.CreateUserAccountRequest;
import com.example.goldTradeDemo.api.response.BasicResponse;
import com.example.goldTradeDemo.api.response.CreateUserAccountResponse;
import com.example.goldTradeDemo.model.UserAccount;
import com.example.goldTradeDemo.service.Impl.UserAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-account")
public class UserAccountController {

    private final UserAccountServiceImpl userAccountServiceImpl;

    public UserAccountController(UserAccountServiceImpl userAccountServiceImpl) {
        this.userAccountServiceImpl = userAccountServiceImpl;
    }


    @RequestMapping(value = "/rejestracja", method = RequestMethod.GET)
    public ModelAndView showform(Model model) {
        return new ModelAndView("registry", "user-account", new UserAccount());
    }

//    @RequestMapping(value = "/create")
//    public ModelAndView save(@ModelAttribute(value = "emp") UserAccount userAccount) {
//        if (userAccount.getAccountId() == 0) {
//            userAccount.getAccountId() + 1);
//            System.out.println("adding");
//            list.add(emp);
//        } else {
//            Emp empTemp = getEmployeesById(emp.getId());
//            empTemp.setName(emp.getName());
//            empTemp.setDesignation(emp.getDesignation());
//            emp.setSalary(emp.getSalary());
//        }
//
//        return new ModelAndView("redirect:/viewemp");
//    }

    @PostMapping(value = "/create", produces = "application/json")
    public ResponseEntity<CreateUserAccountResponse> createUserAccount(
            @RequestBody CreateUserAccountRequest request
    ) {
        return userAccountServiceImpl.createUserAccount(request);
    }

    @PutMapping (value = "/user-account/{accountId}/balanceUSD/updateUSD", produces = "applicatrion/json")
    public ResponseEntity<BasicResponse> updateUserAccountUSD
            (@RequestParam double ownerBalanceUSD,
             @PathVariable int accountId){
        return null;
    }


    @PutMapping (value = "/user-account/{accountId}/balanceXAG/updateXAG", produces = "applicatrion/json")
    public ResponseEntity<BasicResponse> updateUserAccountXAG
            (@RequestParam double ownerBalanceXAG,
             @PathVariable int accountId){
        return null;
    }

}
