package com.fzj.build;

import com.fzj.proxy.Proxy;

abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();

}
