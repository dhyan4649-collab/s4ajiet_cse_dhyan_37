class Solution {
public:
    int countVowelPermutation(int n) {
        long a = 1, e = 1, i = 1, o = 1, u = 1;
        long MOD = 1e9 + 7;
        
        for (int j = 1; j < n; j++) {
            long a_next = (e + i + u) % MOD;
            long e_next = (a + i) % MOD;
            long i_next = (e + o) % MOD;
            long o_next = (i) % MOD;
            long u_next = (i + o) % MOD;
            
            a = a_next;
            e = e_next;
            i = i_next;
            o = o_next;
            u = u_next;
        }
        
        return (a + e + i + o + u) % MOD;
    }
};
