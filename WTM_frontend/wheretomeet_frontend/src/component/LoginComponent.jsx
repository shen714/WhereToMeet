import React, { useState } from "react";
import {Form, FormLabel } from "react-bootstrap";
import Button from 'react-bootstrap/Button';
import "./LoginComponent.css";

export default function LoginComponent(props) {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    function validateForm() {
	    return email.length > 0 && password.length > 0;
    }

    function handleSubmit(event) {
	    event.preventDefault();
    }

    return (
        <div className="Login">
            <Form onSubmit={handleSubmit}>
                <Form.Group controlId="email" size="lg">
                    <Form.Label>Email address</Form.Label>
                    <Form.Control
                        autoFocus
                        type="email"
                        placeholder="Enter Email"
                        value={email}
                        onChange={e => setEmail(e.target.value)}
                    />
                </Form.Group>
                <Form.Group controlId="password" size="lg">
                <Form.Label>Password</Form.Label>
                    <Form.Control
                        value={password}
                        type="password"
                        placeholder="Enter Password"
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