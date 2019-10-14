package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;
import userfuncs.binaryfuncs.BinaryFuncProvider;

public class AbsMinusProvider implements BinaryFuncProvider{

    @Override
    public BinaryFunc get() {
        return new AbsMinus();
    }
}