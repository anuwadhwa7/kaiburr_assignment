package org.kaiburr.servers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "server not found")
public class ServerNotFoundException extends RuntimeException {
}
