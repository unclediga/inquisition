/*
 *  Primitive Collections for Java.
 *  Copyright (C) 2002, 2003  Søren Bak
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package com.uwyn.jhighlight.pcj.hash;

import com.uwyn.jhighlight.pcj.util.Exceptions;

/**
 *  This class provides a static table of int sized prime numbers.
 *  For small numbers (0-511) it contains all primes. For larger
 *  numbers it contains 32 primes each time the number of bits is
 *  increased. I.e., there are 32 primes from 512 to 1023,
 *  32 primes from 1024 to 2048, etc., the primes thus becoming less
 *  dense with size. Within the interval formed by using one more
 *  bit (say, v0 to v1), the 32 primes are formed by searching for
 *  the first prime greater than or equal to v0 + n*(v1-v0)/32, n
 *  belonging to {0,1,2, ..., 31}. This creates a reasonable
 *  distribution.
 *
 *  @author     S&oslash;ren Bak
 *  @version    1.2     21-08-2003 20:21
 *  @since      1.0
 */
public class Primes
{
	
    /** Prime numbers in ascending order. */
    private static final int[] primes = {
		1,3,5,7,11,13,17,19,23,29,31,
		37,41,43,47,53,59,61,67,71,73,79,
		83,89,97,101,103,107,109,113,127,131,137,
		139,149,151,157,163,167,173,179,181,191,193,
		197,199,211,223,227,229,233,239,241,251,257,
		263,269,271,277,281,283,293,307,311,313,317,
		331,337,347,349,353,359,367,373,379,383,389,
		397,401,409,419,421,431,433,439,443,449,457,
		461,463,467,479,487,491,499,503,509,521,541,
		547,563,577,593,613,631,641,659,673,691,709,
		727,739,757,769,787,809,821,839,853,877,881,
		907,919,929,947,967,977,997,1009,1031,1061,1091,
		1123,1153,1187,1217,1249,1283,1319,1361,1381,1409,1447,
		1481,1511,1543,1571,1601,1637,1667,1697,1733,1777,1801,
		1831,1861,1889,1931,1973,1987,2017,2053,2113,2179,2243,
		2309,2371,2437,2503,2579,2633,2689,2753,2819,2887,2953,
		3011,3079,3137,3203,3271,3329,3407,3457,3527,3593,3659,
		3719,3779,3847,3907,3989,4049,4099,4229,4357,4481,4621,
		4751,4871,4993,5147,5261,5381,5507,5639,5779,5897,6029,
		6151,6277,6421,6529,6659,6791,6917,7043,7177,7297,7433,
		7559,7681,7817,7937,8069,8209,8461,8707,8963,9221,9473,
		9733,10007,10243,10499,10753,11027,11273,11527,11777,12037,12289,
		12547,12809,13063,13313,13577,13829,14081,14341,14593,14851,15107,
		15361,15619,15877,16139,16411,16901,17417,17921,18433,18947,19457,
		19973,20483,21001,21517,22027,22531,23041,23557,24071,24593,25097,
		25601,26113,26627,27143,27653,28163,28687,29191,29717,30211,30727,
		31237,31751,32257,32771,33797,34819,35851,36871,37889,38917,39937,
		40961,41999,43013,44041,45061,46091,47111,48131,49157,50177,51203,
		52237,53267,54277,55313,56333,57347,58369,59393,60427,61441,62467,
		63493,64513,65537,67589,69653,71693,73751,75781,77839,79873,81929,
		83969,86017,88069,90121,92173,94219,96259,98317,100357,102407,104459,
		106501,108553,110597,112643,114689,116741,118787,120833,122887,124951,126989,
		129037,131101,135173,139267,143387,147457,151553,155653,159763,163841,167953,
		172049,176129,180233,184321,188417,192529,196613,200713,204803,208907,212999,
		217111,221197,225287,229393,233477,237571,241667,245771,249857,253969,258061,
		262147,270337,278543,286721,294919,303119,311299,319489,327689,335879,344083,
		352267,360457,368647,376837,385027,393241,401411,409609,417793,425987,434179,
		442397,450563,458789,466951,475141,483337,491527,499717,507907,516127,524309,
		540677,557057,573451,589829,606223,622603,638977,655373,671753,688133,704521,
		720899,737281,753677,770053,786433,802829,819229,835591,851971,868369,884743,
		901133,917513,933893,950281,966659,983063,999431,1015813,1032193,1048583,1081351,
		1114117,1146881,1179649,1212427,1245187,1277957,1310723,1343491,1376257,1409027,1441807,
		1474579,1507369,1540109,1572869,1605677,1638431,1671191,1703941,1736711,1769473,1802261,
		1835017,1867783,1900553,1933331,1966123,1998881,2031671,2064389,2097169,2162717,2228243,
		2293771,2359303,2424833,2490377,2555911,2621447,2686979,2752513,2818103,2883593,2949137,
		3014659,3080237,3145739,3211279,3276803,3342341,3407881,3473419,3538949,3604481,3670027,
		3735553,3801097,3866627,3932167,3997723,4063237,4128781,4194319,4325389,4456451,4587533,
		4718617,4849687,4980749,5111833,5242883,5373971,5505037,5636123,5767169,5898253,6029329,
		6160391,6291469,6422531,6553621,6684673,6815749,6946817,7077893,7208977,7340033,7471127,
		7602187,7733251,7864331,7995397,8126473,8257537,8388617,8650753,8912921,9175057,9437189,
		9699331,9961487,10223617,10485767,10747921,11010059,11272193,11534351,11796503,12058679,12320773,
		12582917,12845069,13107229,13369399,13631489,13893637,14155777,14417927,14680067,14942209,15204391,
		15466499,15728681,15990791,16252967,16515073,16777259,17301517,17825803,18350093,18874379,19398727,
		19922993,20447239,20971529,21495809,22020127,22544387,23068673,23592967,24117257,24641543,25165843,
		25690121,26214401,26738717,27262997,27787267,28311553,28835857,29360147,29884417,30408713,30933011,
		31457287,31981583,32505901,33030163,33554467,34603013,35651593,36700201,37748743,38797379,39845899,
		40894481,41943049,42991621,44040253,45088781,46137359,47185967,48234517,49283083,50331653,51380233,
		52428841,53477453,54525979,55574567,56623153,57671683,58720267,59768843,60817411,61865989,62914619,
		63963149,65011717,66060311,67108879,69206017,71303171,73400329,75497479,77594641,79691779,81788929,
		83886091,85983239,88080389,90177541,92274737,94371863,96469001,98566147,100663319,102760453,104857601,
		106954759,109051907,111149057,113246209,115343383,117440551,119537689,121634819,123731977,125829139,127926307,
		130023431,132120577,134217757,138412033,142606357,146800649,150994979,155189249,159383563,163577857,167772161,
		171966481,176160779,180355079,184549429,188743691,192937991,197132293,201326611,205520911,209715263,213909511,
		218103811,222298127,226492433,230686721,234881033,239075351,243269639,247463939,251658263,255852593,260046883,
		264241223,268435459,276824071,285212677,293601283,301989917,310378501,318767107,327155743,335544323,343932959,
		352321547,360710167,369098771,377487361,385876021,394264613,402653189,411041831,419430419,427819031,436207619,
		444596227,452984849,461373449,469762049,478150661,486539323,494927929,503316511,511705091,520093703,528482347,
		536870923,553648171,570425377,587202571,603979799,620757019,637534277,654311459,671088667,687865859,704643083,
		721420307,738197549,754974721,771751961,788529191,805306457,822083597,838860817,855638023,872415239,889192471,
		905969671,922746883,939524129,956301317,973078537,989855747,1006632983,1023410207,1040187403,1056964619,1073741827,
		1107296257,1140850699,1174405129,1207959559,1241514007,1275068423,1308622877,1342177283,1375731737,1409286161,1442840579,
		1476395029,1509949451,1543503881,1577058331,1610612741,1644167233,1677721631,1711276033,1744830469,1778384921,1811939329,
		1845493777,1879048201,1912602647,1946157079,1979711497,2013265921,2046820357,2080374797,2113929217,Integer.MAX_VALUE,
    };
	
    /** Prevents instantiation. */
    private Primes()
	{ }
	
    /**
     *  Returns from a static prime table the least prime that is greater
     *  than or equal to a specified value.
     *
     *  On average, the returned prime will about 1/64 of 2<sup>(r+1)</sup> - 2<sup>r</sup>
     *  greater than n, where r is the order of n (the number of bits
     *  required for representing it).
     *
     *  @return     the least prime in the table that is greater
     *              than or equal to the specified value.
     */
    public static int nextPrime(int n)
	{
        if (n<=0)
            Exceptions.negativeArgument("lower bound", String.valueOf(n));
        int idx = java.util.Arrays.binarySearch(primes, n);
        if (idx<0)
            return primes[-idx-1];
        return primes[idx];
    }
	
}
