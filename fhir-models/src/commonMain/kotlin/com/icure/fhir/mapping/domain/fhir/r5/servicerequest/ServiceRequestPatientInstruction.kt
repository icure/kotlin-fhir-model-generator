//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.servicerequest

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Patient or consumer-oriented instructions
 *
 * Instructions in terms that are understood by the patient or consumer.
 *
 * @param id Unique id for inter-element referencing
 * @param instructionMarkdown Patient or consumer-oriented instructions
 * @param instructionReference Patient or consumer-oriented instructions
 */
@SerialName("ServiceRequestPatientInstruction")
@Serializable
public data class ServiceRequestPatientInstruction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Patient or consumer-oriented instructions
   */
  public val instructionMarkdown: String? = null,
  /**
   * Patient or consumer-oriented instructions
   */
  public val instructionReference: Reference? = null,
) : BackboneElement
