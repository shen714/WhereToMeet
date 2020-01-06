import React, { useState } from "react";
import {Col, Button, Card, Form, Row} from "react-bootstrap";
import "./SignUpComponent.css";

export default function SignUpComponent(props) {
    const handleSubmit = event => {
        const form = event.currentTarget;
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
      };
    return (
        <div className="SignUpCardContainer">
            <Card className="SignUpCard" style={{ width: '18rem' }}>
                <Card.Header>Your Information</Card.Header>
                <Card.Body>
                    <Form noValidate onSubmit={handleSubmit}>
                        <Form.Group as={Row}>
                            <Form.Label>Username</Form.Label>
                            <Form.Control
                                required
                                type="text"
                                placeholder="Username"
                            />
                            <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                            
                            <Form.Label>Password</Form.Label>
                            <Form.Control
                                required
                                type="text"
                                placeholder="Password"
                            />
                            <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                        </Form.Group>
                        <Form.Group as={Row}>
                            <Form.Label as="legend">
                                Preferred Places
                            </Form.Label>
                            <Col sm={10}>
                                <Form.Check 
                                    type="checkbox"
                                    id="checkbox-restuarant"
                                    label="Restuarant"
                                />
                                <Form.Check 
                                    type="checkbox"
                                    id="checkbox-movie"
                                    label="Movie Theater"
                                />
                                <Form.Check 
                                    type="checkbox"
                                    id="checkbox-shopping"
                                    label="Shopping Mall"
                                />
                            </Col>
                        </Form.Group>
                        <Form.Group as={Row}>
                            <Col>
                                <Button type="submit">Sign up</Button>
                            </Col>
                        </Form.Group>
                    </Form>
                </Card.Body>
            </Card>
        </div>
    );
}