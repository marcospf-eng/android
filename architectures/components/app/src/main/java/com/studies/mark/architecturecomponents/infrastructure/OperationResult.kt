package com.studies.mark.architecturecomponents.infrastructure

class OperationResult<TResult>(
        private val result: TResult,
        private val operationCompletedType: OperationCompletedType) {

    enum class OperationCompletedType {
        SUCCESS, ERROR
    }

    fun getResult() : TResult {
        return result
    }

    fun getOperationCompletedType() : OperationCompletedType {
        return operationCompletedType
    }

}