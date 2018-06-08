package com.studies.mark.architecturecomponents.infrastructure

abstract class OperationListener<TResult> {

    abstract fun onOperationSuccess(result: TResult)

    abstract fun onOperationError(result: TResult)

}