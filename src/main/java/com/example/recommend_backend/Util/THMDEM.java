package com.example.recommend_backend.Util;

import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Random;

public class THMDEM {
    private static final int pp = 32;


    public static BigInteger GenPrime(int length){
        Random r = new Random();
        return BigInteger.probablePrime(length,r);

    }

    public static BigInteger[][] UserKeyGen(int L){
        BigInteger[][] result = new BigInteger[L][6];
        for (int i=0;i<L;i++){
            result[i][0]=GenPrime(pp);//p
            result[i][1]=GenPrime(pp);//q
            result[i][2]=GenPrime(pp);//s
            result[i][3]=result[i][0].multiply(result[i][1]);//N
            result[i][3]=result[i][0].multiply(result[i][1])

        }
        for (int i=0;i<L;i++){
            result[1][i]=GenPrime(pp);
        }
        for (int i=0;i<L;i++){
            result[2][i]=GenPrime(pp);
        }
        for (int i=0;i<L;i++){
            result[3][i]=result[0][i].multiply(result[1][i]);
            result[4][i]=result[0][i].multiply(result[1][i]).multiply(result[2][i]);
        }
        return result;
    }

    public static BigInteger[] SeverKeyGen(){
        BigInteger[] result = new BigInteger[5];
        result[0]=GenPrime(pp);
        result[1]=GenPrime(pp);
        result[2]=GenPrime(pp);
        result[3]=result[0].multiply(result[1]);
        result[4]=result[0].multiply(result[1]).multiply(result[2]);
        return result;
    }

    public static BigInteger Encrypt(int[] m, BigInteger p, BigInteger q,BigInteger N,BigInteger T, PublicKey pk_ser, PublicKey pk_csp){
        BigInteger r = GenPrime(pp);
        BigInteger r_tag = GenPrime(pp);
        int l=m.length;
        int[] s = new int[l];
        for(int i = 0;i<l;i++)
            s[i] = m[i]==0 ? 1:0;
        BigInteger[] k1 = new BigInteger[0],k2= new BigInteger[l],k1_tag= new BigInteger[l],k2_tag= new BigInteger[l],t = new BigInteger[l],C=new BigInteger[l],C_tag = new BigInteger[l];
        for(int i = 0;i<l;i++){
            k1[i] = GenPrime(pp);
            k2[i] = GenPrime(pp);
            k1_tag[i] = GenPrime(pp);
            k2_tag[i] = GenPrime(pp);
            t[i] = GenPrime(pp);

            C[i]= r.multiply(p.multiply(p.modInverse(q)).multiply(BigInteger.valueOf(m[i]+s[i])));
        }



        return null;
    }


}
