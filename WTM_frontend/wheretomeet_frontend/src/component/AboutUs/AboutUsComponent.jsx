import React, { useState } from "react";
import {Button, Card} from "react-bootstrap";
import ShenImg from '../../shen.jpg'
import YanImg from '../../yan.jpg'
import "./AboutUsComponent.css";

export default function AboutUsComponent(props) {
    
    return (
        <div className="AboutUs">
            <Card style={{ width: '18rem' }}>
                <Card.Img variant="top" src={ShenImg} />
                <Card.Body>
                <Card.Title>Shen Guo</Card.Title>
                <Card.Text>
                    Shen is currently a second-year computer science student at Northeastern University.
                </Card.Text>
                </Card.Body>
            </Card>
            <Card style={{ width: '18rem' }}>
                <Card.Img variant="top" src={YanImg} />
                <Card.Body>
                <Card.Title>Yan Li</Card.Title>
                <Card.Text>
                    Yan is Shen's husband who loves her very much.
                </Card.Text>
                </Card.Body>
            </Card>
        </div>
	);
}