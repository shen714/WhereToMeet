import React, { useState } from "react";
import {Button, Form} from "react-bootstrap";
import "./LoginComponent.css";

export default function LoginComponent(props) {
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    function validateForm() {
	    return userName.length > 0 && password.length > 0;
    }

    function handleSubmit(event) {
	    event.preventDefault();
    }

    return (
        <div className="Login">
            <Form onSubmit={handleSubmit}>
                <Form.Group controlId="email" size="lg">
                    <Form.Label>Username</Form.Label>
                    <Form.Control
                        autoFocus
                        type="text"
                        placeholder="Enter username"
                        value={userName}
                        onChange={e => setUserName(e.target.value)}
                    />
                </Form.Group>
                <Form.Group controlId="password" size="lg">
                <Form.Label>Password</Form.Label>
                    <Form.Control
                        value={password}
                        type="password"
                        placeholder="Enter password"
                        onChange={e => setPassword(e.target.value)}
                    />
                </Form.Group>
                <Button variant="primary" type="submit">
                    Sign in
                </Button>
            </Form>
        </div>
	);
}