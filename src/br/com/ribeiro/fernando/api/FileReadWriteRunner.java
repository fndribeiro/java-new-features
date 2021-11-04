package br.com.ribeiro.fernando.api;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("./resources/sample.txt");
		
		/**
	     * Reads all content from a file into a string, decoding from bytes to characters
	     * using the {@link StandardCharsets#UTF_8 UTF-8} {@link Charset charset}.
	     * The method ensures that the file is closed when all content have been read
	     * or an I/O error, or other runtime exception, is thrown.
	     *
	     * <p> This method is equivalent to:
	     * {@code readString(path, StandardCharsets.UTF_8) }
	     *
	     * @param   path the path to the file
	     *
	     * @return  a String containing the content read from the file
	     *
	     * @throws  IOException
	     *          if an I/O error occurs reading from the file or a malformed or
	     *          unmappable byte sequence is read
	     * @throws  OutOfMemoryError
	     *          if the file is extremely large, for example larger than {@code 2GB}
	     * @throws  SecurityException
	     *          In the case of the default provider, and a security manager is
	     *          installed, the {@link SecurityManager#checkRead(String) checkRead}
	     *          method is invoked to check read access to the file.
	     *
	     * @since 11
	     */
		String fileContent = Files.readString(path);
		
		System.out.println(fileContent);
		
		String newFileContent = fileContent.replace("Line", "Lines");
		
		Path newFilePath = Paths.get("./resources/sample-new.txt");
		
		/**
	     * Write a {@linkplain java.lang.CharSequence CharSequence} to a file.
	     * Characters are encoded into bytes using the
	     * {@link StandardCharsets#UTF_8 UTF-8} {@link Charset charset}.
	     *
	     * <p> This method is equivalent to:
	     * {@code writeString(path, test, StandardCharsets.UTF_8, options) }
	     *
	     * @param   path
	     *          the path to the file
	     * @param   csq
	     *          the CharSequence to be written
	     * @param   options
	     *          options specifying how the file is opened
	     *
	     * @return  the path
	     *
	     * @throws  IllegalArgumentException
	     *          if {@code options} contains an invalid combination of options
	     * @throws  IOException
	     *          if an I/O error occurs writing to or creating the file, or the
	     *          text cannot be encoded using the specified charset
	     * @throws  UnsupportedOperationException
	     *          if an unsupported option is specified
	     * @throws  SecurityException
	     *          In the case of the default provider, and a security manager is
	     *          installed, the {@link SecurityManager#checkWrite(String) checkWrite}
	     *          method is invoked to check write access to the file. The {@link
	     *          SecurityManager#checkDelete(String) checkDelete} method is
	     *          invoked to check delete access if the file is opened with the
	     *          {@code DELETE_ON_CLOSE} option.
	     *
	     * @since 11
	     */
		Files.writeString(newFilePath, newFileContent);

	}

}
