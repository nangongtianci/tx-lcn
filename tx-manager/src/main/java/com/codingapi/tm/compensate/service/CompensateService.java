package com.codingapi.tm.compensate.service;

import com.codingapi.tm.compensate.model.TransactionCompensateMsg;
import com.codingapi.tm.compensate.model.TxModel;

import java.util.List;

/**
 * create by lorne on 2017/11/11
 */
public interface CompensateService {

    boolean saveCompensateMsg(TransactionCompensateMsg transactionCompensateMsg);

    List<String> loadModelList();

    List<String> childModel(String model);

    List<String> logFile(String path);

    List<TxModel> logs(String path);

}
