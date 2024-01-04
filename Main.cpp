#include <bits/stdc++.h>
using namespace std;

#define endl '\n'
#define int long long
#define yes cout << "YES" << endl;
#define no cout << "NO" << endl;
#define pb push_back
#define ppb pop_back
const int MOD = 1e9 + 7;
const int INF = LLONG_MAX >> 1;
const int NEG_INF = LLONG_MIN;

//=============== template ends here ================
void solve() {

}
signed main() {
#ifndef ONLINE_JUDGE
	// for getting input from input.txt
	freopen("input.txt", "r", stdin);
	// for writting output to output.txt
	freopen("output.txt", "w", stdout);
#endif

	ios::sync_with_stdio(false); cin.tie(NULL);

	// solve();
	
    int n, x;cin>>n>>x;
    vector<int>v;
    for(int i=1;i<=n;++i)
    {
v.push_back(i);

    	}
if(x == 0){
for(auto i :v){
    cout << i << " ";
}
return;
}
if(x >= n || n - x == 1){
    cout << -1;
    return;
}
reverse(v.begin(), v.end());
reverse(v.begin() + n - x - 1, v.end());
for(auto i :v){
    cout << i << " ";
}
}