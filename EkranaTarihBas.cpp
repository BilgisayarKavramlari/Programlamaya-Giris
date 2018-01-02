#include <iostream>
using namespace std;
#include <ctime>

int main () {

	time_t now = time(0);
	char* dt = ctime(&now);
	cout << "Bugunun Tarihi: " << dt;
	return 0;

}
