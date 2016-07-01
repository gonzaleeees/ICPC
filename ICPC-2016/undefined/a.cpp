#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
int main() {
  int n = 0;
  while(cin >> n, n) {
    int ary[10000] = {};
    long long minnum = 10000000;

    for(int i = 0; i < n; i++) {
      cin >> ary[i];
    }

    for(int i = 0; i < n; i++) {
      for(int j = i + 1; j < n; j++) {
        minnum = (abs(ary[i] - ary[j]) >= minnum)? minnum : abs(ary[i] - ary[j]);
      }
    }
    cout << minnum << endl;
  }
}
