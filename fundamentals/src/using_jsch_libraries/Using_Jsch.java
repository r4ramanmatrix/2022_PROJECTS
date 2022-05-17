package using_jsch_libraries;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class Using_Jsch {

	public static void main(String[] args) {
		JSch js = new JSch();

		String username = "rama";
		String password = "Rama@911";
		String host = "192.168.2.100";
		int port = 22;

		try {
			Session ses = js.getSession(username, host, port);

			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			ses.setConfig(config);

			ses.setPassword(password);
			ses.connect(15000);

			System.out.println("Connection Established!!");

			Channel ch = ses.openChannel("sftp");
			ch.connect(5000);

			ChannelSftp sftpCh = (ChannelSftp) ch;

			try {
				sftpCh.put("twenty1.txt", "/home/rama/onlyTextFiles/twenty1.txt");
				sftpCh.disconnect();
				sftpCh.exit();
				ses.disconnect();

			} catch (SftpException e) {
				e.printStackTrace();
			}

		} catch (JSchException e) {
			e.printStackTrace();
		}

	}

}
