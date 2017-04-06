import pexpect
import pxssh
import threading
import datetime
import time
import sys

def server(): # too many problems, manually start server please!

	#child = pexpect.spawn('java -jar "home/austin/Documents/qaProject3/dist/Server/BattleshipServer.jar"')
	#child.send("asdf")
	#child.expect("Enter address to bind to (empty for 'http://localhost:9999/battleship'):")
	#child.logfile = sys.stdout
	#child.sendline("ssh austin@austin-VirtualBox")
	#child.expect("String")
	#child = pexpect.spawn('ant -Dconfig=Server')
	return

def client():
	#child = pexpect.spawn('ant -Dconfig=Client')
	child = pexpect.spawn('java -jar /home/austin/Documents/qaProject3/dist/Client/BattleshipClient.jar')
	child.logfile_read = sys.stdout
	child.expect("Enter host:")
	#time.sleep(1)
	child.logfile_read = sys.stdout
	child.send('http://localhost:9999/battleship\n') #for some reason this seems to only work w/ the \n
	child.logfile_read = sys.stdout
	child.expect('.*Please enter a start coordinate to place your Carrier.*')
	#child.expect('.*')
	time.sleep(1)
	child.logfile_read = sys.stdout
	child.send('A:1') # this seems to do nothing somehow
	child.logfile_read = sys.stdout
	child.expect('.*')
	#time.sleep(5)
	print "printed"
	#child.wait()

	return


#tserver = threading.Thread(name = 'my_server', target = server)
tclient1 = threading.Thread(name = 'my_client1', target = client)
tclient2 = threading.Thread(name = 'my_client2', target = client)

#tserver.start()
tclient1.start()
tclient2.start()


