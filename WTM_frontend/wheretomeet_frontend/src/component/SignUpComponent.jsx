import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import {Col, Button, Card, Form, Row} from "react-bootstrap";
import "./SignUpComponent.css";
import UserDataService from '../service/UserDataService'

export default function SignUpComponent(props) {
    const handleSubmit = event => {
        const form = event.currentTarget;
        if (form.checkValidity() === false) {
          event.stopPropagation();
        }
        // const checkboxes = document.getElementsByName("checkbox");
        // let preferences = [];
        // for (let i = 0; i < checkboxes.length; i++) {
        //     if (checkboxes[i].checked) {
        //         preferences.append(checkboxes[i]);
        //     }
        // }

        let user = {
            userName: document.getElementById("username").value,
            password: document.getElementById("password").value,
            preferredPlaces: "preference"
        }

        saveUserInfo(user);
        event.preventDefault();
      };

    const saveUserInfo = (user) => {
        UserDataService.saveUserInfo(user)
          .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          })
    }
    
    // useEffect(() => {
    //     UserDataService.retrieveAllUsers()
    //         .then(
    //             response => {console.log(response)}
    //         )
    // });

    


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
                                id="username"
                                type="text"
                                placeholder="Username"
                            />
                            <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
                            
                            <Form.Label>Password</Form.Label>
                            <Form.Control
                                required
                                id="password"
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
                                    name="checkbox"
                                    id="checkbox-restaurant"
                                    label="Restaurant"
                                />
                                <Form.Check 
                                    type="checkbox"
                                    name="checkbox"
                                    id="checkbox-movie"
                                    label="Movie Theater"
                                />
                                <Form.Check 
                                    type="checkbox"
                                    name="checkbox"
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